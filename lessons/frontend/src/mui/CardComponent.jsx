import * as React from "react";
import Box from "@mui/material/Box";
import Card from "@mui/material/Card";
import CardActions from "@mui/material/CardActions";
import CardContent from "@mui/material/CardContent";
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import SvgIcon from "@mui/material/SvgIcon";

function HomeIcon(props) {
  return (
    <SvgIcon {...props}>
      <path d="M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z" />
    </SvgIcon>
  );
}

const bull = (
  <Box
    component="span"
    sx={{ display: "inline-block", mx: "2px", transform: "scale(0.8)" }}
  >
    •
  </Box>
);
const CardComponent = () => {
  return (
    <Card sx={{ minWidth: 275 }}>
      <HomeIcon color="primary" />
      <CardContent>
        <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
          React Kursu
        </Typography>
        <Typography variant="h5" component="div">
          go{bull}do{bull}ro
        </Typography>
        <Typography sx={{ mb: 1.5 }} color="text.secondary">
          adjective
        </Typography>
        <Typography variant="body2">
          JS JAVA TS REACT
          <br />
        </Typography>
      </CardContent>
      <CardActions>
        <Button size="small">Fazlasını Gör</Button>
      </CardActions>
    </Card>
  );
};

export default CardComponent;
